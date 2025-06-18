public class FinancialForecasting {
    // Recursive method to calculate future value with compound interest
    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
        // Base case: if years is 0, return present value
        if (years == 0) {
            return presentValue;
        }
        
        // Recursive case: calculate value for previous year and apply growth rate
        return calculateFutureValue(presentValue, growthRate, years - 1) * (1 + growthRate);
    }

    // Recursive method to calculate future value with varying growth rates
    public static double calculateFutureValueWithVaryingRates(double presentValue, double[] growthRates, int currentYear) {
        // Base case: if we've processed all years, return present value
        if (currentYear >= growthRates.length) {
            return presentValue;
        }
        
        // Recursive case: apply current year's growth rate and move to next year
        double currentValue = presentValue * (1 + growthRates[currentYear]);
        return calculateFutureValueWithVaryingRates(currentValue, growthRates, currentYear + 1);
    }

    // Optimized recursive method using memoization to avoid redundant calculations
    public static double calculateFutureValueOptimized(double presentValue, double growthRate, int years, double[] memo) {
        // Base case: if years is 0, return present value
        if (years == 0) {
            return presentValue;
        }
        
        // Check if we've already calculated this value
        if (memo[years] != 0) {
            return memo[years];
        }
        
        // Calculate and store the result
        memo[years] = calculateFutureValueOptimized(presentValue, growthRate, years - 1, memo) * (1 + growthRate);
        return memo[years];
    }

    // Helper method to create and initialize memoization array
    public static double calculateFutureValueWithMemoization(double presentValue, double growthRate, int years) {
        double[] memo = new double[years + 1];
        return calculateFutureValueOptimized(presentValue, growthRate, years, memo);
    }
} 