package records;

public record Dish(String name, Boolean vegetarian, Integer calories, Type type ) {
    public enum Type { MEAT, FISH, OTHER }
}


