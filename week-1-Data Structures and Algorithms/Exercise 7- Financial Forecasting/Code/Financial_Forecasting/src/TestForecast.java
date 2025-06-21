public class TestForecast {
    public static void main(String[] args) {
        double initialInvestment = 10000; 
        double annualGrowthRate = 0.10;   
        int years = 5;

        double result = ForecastCalculator.calculateFutureValue(initialInvestment, annualGrowthRate, years);

        System.out.printf("Predicted value after %d years: $%.2f\n", years, result);
    }
}
