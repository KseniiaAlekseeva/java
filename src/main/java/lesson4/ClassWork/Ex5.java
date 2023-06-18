package lesson4.ClassWork;

import java.util.Stack;

public class Ex5 {
    public static void main(String[] args) {
        System.out.println("simplifyPath(path) = " + simplifyPath("/home/"));
        System.out.println("simplifyPath(path) = " + simplifyPath("/../"));
        System.out.println("simplifyPath(path) = " + simplifyPath("/home//foo/"));
    }

    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        StringBuilder res = new StringBuilder();
        String[] folders = path.split("/");
        for (String folder : folders) {
            if (folder.equals("..")) {
                if (!stack.isEmpty())
                    stack.pop();
            } else if (!folder.equals(".") && !folder.isEmpty())
                stack.push(folder);
        }

        if (stack.isEmpty())
            return "/";

        while (!stack.isEmpty())
            res.insert(0, stack.pop()).insert(0, "/");

        return res.toString();
    }
}