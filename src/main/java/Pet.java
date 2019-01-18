class Pet {
    private String name;
    private int priority;

    Pet(String petName, int priority) {
        this.name = petName;
        this.priority = priority;
    }

    String getName() {
        return name;
    }

    int getPriority() {
        return priority;
    }
}
