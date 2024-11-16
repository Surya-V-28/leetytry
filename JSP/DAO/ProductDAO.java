public class MovieRatingsAnalysis {

    public static class RatingsMapper extends Mapper<Object, Text, Text, DoubleWritable> {
        private Text movieId = new Text();
        private DoubleWritable rating = new DoubleWritable();

        @Override
        public void map(Object key, Text value, Context context) throws IOException, InterruptedException {
            String[] fields = value.toString().split(","); // Split the line by comma
            if (fields.length == 2) {
                movieId.set(fields[0]); // Set the movie ID
                rating.set(Double.parseDouble(fields[1])); // Set the rating
                context.write(movieId, rating); // Emit movie ID and rating
            }
        }
    }

    public static class RatingsReducer extends Reducer<Text, DoubleWritable, Text, DoubleWritable> {
        private DoubleWritable averageRating = new DoubleWritable();
        private int count = 0;
        private double sum = 0.0;

        @Override
        public void reduce(Text key, Iterable<DoubleWritable> values, Context context) throws IOException, InterruptedException {
            sum = 0.0;
            count = 0;
            for (DoubleWritable val : values) {
                sum += val.get(); // Sum all ratings for the movie
                count++; // Count the number of ratings
            }
            if (count > 0) {
                averageRating.set(sum / count); // Calculate average rating
                context.write(key, averageRating); // Emit movie ID and average rating
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Configuration conf = new Configuration();
        Job job = Job.getInstance(conf, "movie ratings analysis");
        job.setJarByClass(MovieRatingsAnalysis.class);
        job.setMapperClass(RatingsMapper.class);
        job.setReducerClass(RatingsReducer.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(DoubleWritable.class);

        // Set input and output paths
        FileInputFormat.addInputPath(job, new Path(args[0]));
        FileOutputFormat.setOutputPath(job, new Path(args[1]));

        System.exit(job.waitForCompletion(true) ? 0 : 1);
    }
}