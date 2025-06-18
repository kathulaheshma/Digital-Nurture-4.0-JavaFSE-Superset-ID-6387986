import java.util.Arrays;

public class ProductSearch {
    private Product[] products;

    public ProductSearch(Product[] products) {
        this.products = products;
    }

    // Linear Search - O(n) time complexity
    public Product linearSearch(int productId) {
        for (Product product : products) {
            if (product.getProductId() == productId) {
                return product;
            }
        }
        return null;
    }

    // Binary Search - O(log n) time complexity
    public Product binarySearch(int productId) {
        // Ensure array is sorted for binary search
        Arrays.sort(products);
        
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (products[mid].getProductId() == productId) {
                return products[mid];
            }

            if (products[mid].getProductId() < productId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    // Method to analyze search performance
    public void analyzeSearchPerformance(int productId) {
        System.out.println("Searching for product ID: " + productId);
        
        // Measure linear search time
        long startTime = System.nanoTime();
        Product linearResult = linearSearch(productId);
        long linearTime = System.nanoTime() - startTime;
        
        // Measure binary search time
        startTime = System.nanoTime();
        Product binaryResult = binarySearch(productId);
        long binaryTime = System.nanoTime() - startTime;

        // Print results
        System.out.println("\nLinear Search:");
        System.out.println("Time taken: " + linearTime + " nanoseconds");
        System.out.println("Result: " + (linearResult != null ? linearResult : "Not found"));

        System.out.println("\nBinary Search:");
        System.out.println("Time taken: " + binaryTime + " nanoseconds");
        System.out.println("Result: " + (binaryResult != null ? binaryResult : "Not found"));

        // Analysis
        System.out.println("\nAnalysis:");
        System.out.println("Linear Search Time Complexity: O(n)");
        System.out.println("Binary Search Time Complexity: O(log n)");
        System.out.println("Performance difference: " + (linearTime - binaryTime) + " nanoseconds");
    }
} 