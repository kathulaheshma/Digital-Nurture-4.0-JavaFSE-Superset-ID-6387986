public class SearchTest {
    public static void main(String[] args) {
        // Create sample products
        Product[] products = {
            new Product(1001, "Laptop", "Electronics", 999.99),
            new Product(1002, "Smartphone", "Electronics", 699.99),
            new Product(1003, "Headphones", "Electronics", 199.99),
            new Product(1004, "Desk Chair", "Furniture", 299.99),
            new Product(1005, "Coffee Maker", "Appliances", 149.99),
            new Product(1006, "Blender", "Appliances", 79.99),
            new Product(1007, "Bookshelf", "Furniture", 199.99),
            new Product(1008, "Tablet", "Electronics", 499.99)
        };

        // Create search instance
        ProductSearch search = new ProductSearch(products);

        // Test searching for existing product
        System.out.println("Test Case 1: Searching for existing product (ID: 1004)");
        search.analyzeSearchPerformance(1004);

        // Test searching for non-existing product
        System.out.println("\nTest Case 2: Searching for non-existing product (ID: 9999)");
        search.analyzeSearchPerformance(9999);

        // Explanation of Big O notation and search algorithms
        System.out.println("\nBig O Notation Explanation:");
        System.out.println("1. Linear Search (O(n)):");
        System.out.println("   - Best case: O(1) - Element found at first position");
        System.out.println("   - Average case: O(n/2) - Element found in middle");
        System.out.println("   - Worst case: O(n) - Element found at last position or not found");
        
        System.out.println("\n2. Binary Search (O(log n)):");
        System.out.println("   - Best case: O(1) - Element found at middle");
        System.out.println("   - Average case: O(log n) - Element found after several divisions");
        System.out.println("   - Worst case: O(log n) - Element not found");
        
        System.out.println("\nRecommendation for E-commerce Platform:");
        System.out.println("1. For small datasets (n < 100): Linear search is simpler and sufficient");
        System.out.println("2. For large datasets: Binary search is more efficient");
        System.out.println("3. Consider using a database with proper indexing for production use");
    }
} 