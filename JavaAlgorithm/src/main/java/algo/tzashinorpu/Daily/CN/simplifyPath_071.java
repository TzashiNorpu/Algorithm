package algo.tzashinorpu.Daily.CN;

import java.util.LinkedList;

public class simplifyPath_071 {
    public String simplifyPath(String path) {
//        path = path.replace("/./", "//");
        if (path.endsWith("/.")) {
            path = path.substring(0, path.length() - 1);
        }
        while (path.contains("//")) {
            path = path.replace("//", "/");
        }
        while (path.contains("/./")) {
            path = path.replace("/./", "/");
        }
        if (path.contains("..")) {
            String[] split = path.split("/");
            LinkedList<String> stack = new LinkedList<String>();
            for (int i = 0; i < split.length; i++) {
                if (!split[i].equals("")) {
                    if (split[i].equals("..")) {
                        if (!stack.isEmpty()) {
                            stack.pollLast();
                        }
                    } else {
                        stack.offerLast(split[i]);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("/");
            while (!stack.isEmpty()) {
                sb.append(stack.pollFirst()).append("/");
            }
            path = sb.toString();
        }
        if (path.length() > 1 && path.endsWith("/")) {
            path = path.substring(0, path.length() - 1);
        }
        return path;
    }
}
