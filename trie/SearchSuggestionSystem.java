
import java.util.*;

class Solution {

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> ans = new ArrayList<>();
        int startIndex = 0; // Track starting index from previous matches
        int n = products.length;

        for (int i = 1; i <= searchWord.length(); i++) {
            String prefix = searchWord.substring(0, i);
            List<String> strs = new ArrayList<>();

            // Move startIndex if current product doesn't match prefix
            while (startIndex < n
                    && (products[startIndex].length() < i
                    || !products[startIndex].startsWith(prefix))) {
                startIndex++;
            }

            // Collect up to 3 matching products
            for (int j = startIndex; j < n && strs.size() < 3; j++) {
                if (products[j].startsWith(prefix)) {
                    strs.add(products[j]);
                } else {
                    break; // Since sorted, no need to check further
                }
            }
            ans.add(strs);
        }
        return ans;
    }
}

/// normal methods


class Solution1 {

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> ans = new ArrayList<>();

        for (int i = 1; i <= searchWord.length(); i++) {
            String prefix = searchWord.substring(0, i);
            List<String> strs = new ArrayList<>();
            for (String product : products) {
                if (product.startsWith(prefix)) {
                    strs.add(product);
                    if (strs.size() == 3) {
                        break;
                    }
                }
            }
            ans.add(strs);
        }
        return ans;
    }
}
