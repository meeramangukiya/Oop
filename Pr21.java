class VotingApp {

    public static void checkEligibility(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {

        int ages[] = {16, 18, 20};

        for (int age : ages) {
            try {
                System.out.println("Age: " + age);
                checkEligibility(age);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Validation process completed\n");
            }
        }
    }
}
/*
Age: 16
Age must be 18 or above to vote
Validation process completed

Age: 18
Eligible to vote
Validation process completed

Age: 20
Eligible to vote
Validation process completed*/
