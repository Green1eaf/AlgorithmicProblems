package leetcode;

// https://leetcode.com/problems/unique-email-addresses/

import java.util.HashSet;
import java.util.Set;

public class UniqueEmail {
    public static void main(String[] args) {
        System.out.println(numUniqueEmails(
                new String[]{"test.email+alex@leetcode.com",
                        "test.e.mail+bob.cathy@leetcode.com",
                        "testemail+david@lee.tcode.com"}));
    }

    public static int numUniqueEmails(String[] emails) {
        Set<String> ans = new HashSet<>();
        for (String s : emails) {
            String[] split = s.split("@");
            String name = split[0];
            String domain = split[1];
            name = name.split("[+]")[0].replace(".", "");
            StringBuilder sb = new StringBuilder();
            ans.add(sb.append(name).append("@").append(domain).toString());
        }
        return ans.size();
    }
}
