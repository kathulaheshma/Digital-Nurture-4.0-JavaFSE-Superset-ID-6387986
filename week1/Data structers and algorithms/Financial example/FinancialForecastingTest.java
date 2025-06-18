public class FinancialForecastingTest {
    public static void main(String[] args) {
        // Test parameters
        double initialInvestment = 10000.0;
        double growthRate = 0.05; // 5% annual growth
        int years = 10;

        // Test 1: Basic recursive calculation
        System.out.println("Test 1: Basic Recursive Calculation");
        System.out.println("Initial Investment: $" + initialInvestment);
        System.out.println("Annual Growth Rate: " + (growthRate * 100) + "%");
        System.out.println("Years: " + years);
        
        long startTime = System.nanoTime();
        double futureValue = FinancialForecasting.calculateFutureValue(initialInvestment, growthRate, years);
        long endTime = System.nanoTime();
        
        System.out.println("Future Value: $" + String.format("%.2f", futureValue));
        System.out.println("Calculation Time: " + (endTime - startTime) / 1000000.0 + " milliseconds");

        // Test 2: Varying growth rates
        System.out.println("\nTest 2: Varying Growth Rates");
        double[] varyingRates = {0.05, 0.06, 0.04, 0.07, 0.05}; // 5 years of varying rates
        
        startTime = System.nanoTime();
        double futureValueVarying = FinancialForecasting.calculateFutureValueWithVaryingRates(
            initialInvestment, varyingRates, 0);
        endTime = System.nanoTime();
        
        System.out.println("Future Value with Varying Rates: $" + String.format("%.2f", futureValueVarying));
        System.out.println("Calculation Time: " + (endTime - startTime) / 1000000.0 + " milliseconds");

        // Test 3: Optimized calculation with memoization
        System.out.println("\nTest 3: Optimized Calculation with Memoization");
        
        startTime = System.nanoTime();
        double futureValueOptimized = FinancialForecasting.calculateFutureValueWithMemoization(
            initialInvestment, growthRate, years);
        endTime = System.nanoTime();
        
        System.out.println("Future Value (Optimized): $" + String.format("%.2f", futureValueOptimized));
        System.out.println("Calculation Time: " + (endTime - startTime) / 1000000.0 + " milliseconds");

        // Analysis and Explanation
        System.out.println("\nAnalysis and Explanation:");
        System.out.println("1. Basic Recursive Algorithm:");
        System.out.println("   - Time Complexity: O(2^n) - Exponential growth with each recursive call");
        System.out.println("   - Space Complexity: O(n) - Due to recursion stack");
        
        System.out.println("\n2. Optimized Algorithm with Memoization:");
        System.out.println("   - Time Complexity: O(n) - Each value is calculated only once");
        System.out.println("   - Space Complexity: O(n) - Due to memoization array");
        
        System.out.println("\n3. Varying Growth Rates Algorithm:");
        System.out.println("   - Time Complexity: O(n) - Where n is the number of years");
        System.out.println("   - Space Complexity: O(n) - Due to recursion stack");
        
        System.out.println("\nOptimization Benefits:");
        System.out.println("1. Memoization eliminates redundant calculations");
        System.out.println("2. Significantly reduces time complexity from O(2^n) to O(n)");
        System.out.println("3. Particularly beneficial for long-term forecasts");
    }
} 