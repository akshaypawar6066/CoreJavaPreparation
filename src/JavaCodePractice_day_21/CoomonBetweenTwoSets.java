package JavaCodePractice_day_21;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CoomonBetweenTwoSets {

	public static void main(String[] args) {
		Set<String> env1 = new HashSet<>(Arrays.asList("QA", "Dev", "Prod"));
		Set<String> env2 = new HashSet<>(Arrays.asList("UAT", "Dev", "Prod"));

		env1.retainAll(env2);
		System.out.println("Common Environments are:"+env2);

	}

}
