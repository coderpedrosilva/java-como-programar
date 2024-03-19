// Figura 5.12: AutoPolicyTest.java
// Demonstrando Strings em um switch.
public class Ex29_AutoPolicyTest {
    public static void main(String[] args) {
        // cria dois objetos AutoPolicy
        Ex28_AutoPolicy policy1 = new Ex28_AutoPolicy(11111111, "Toyota Camry", "NJ");
        Ex28_AutoPolicy policy2 = new Ex28_AutoPolicy(22222222, "Ford Fusion", "ME");

        // exibe se cada apólice está em um estado sem culpa
        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
    }

    // método que mostra se um AutoPolicy
    // está em um estado com seguro de automóvel sem culpa
    public static void policyInNoFaultState(Ex28_AutoPolicy policy) {
        System.out.println("The auto policy:");
        System.out.printf(
                "Account #: %d; Car: %s; State %s %s a no-fault state%n%n",
                policy.getAccountNumber(), policy.getMakeAndModel(),
                policy.getState(),
                (policy.isNoFaultState() ? "is" : "is not"));
    }
} // fim da classe AutoPolicyTest