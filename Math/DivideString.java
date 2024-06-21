class Solution {

    String compareFrac(String str) {
        // Code here
         String fracts[]=str.split(",",0);
          fracts[0]=fracts[0].trim();
         fracts[1]=fracts[1].trim();
         String first[]=fracts[0].split("/",0);
        String second[]=fracts[1].split("/",0);
        double a=(double)Integer.parseInt(first[0]);
        double b=(double)Integer.parseInt(first[1]);
        double c=(double)Integer.parseInt(second[0]);
        double d=(double)Integer.parseInt(second[1]);
          if((a/b)>(c/d)){
          return fracts[0];
        }
        else if((a/b)==(c/d)){
          return "equal";
        }
        return fracts[1];
    }

         
    }
