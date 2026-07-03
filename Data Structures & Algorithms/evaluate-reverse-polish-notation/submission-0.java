class Solution {
    public int evalRPN(String[] tokens) {
        List<String> tokenlist = new ArrayList<>(Arrays.asList(tokens));
        int res = 0;

        while (tokenlist.size() > 1) {

            for (int i = 0; i < tokenlist.size(); i++) {

                String token = tokenlist.get(i);

                if (token.equals("*") ||
                    token.equals("+") ||
                    token.equals("-") ||
                    token.equals("/")) {

                    int a = Integer.parseInt(tokenlist.get(i - 2));
                    int b = Integer.parseInt(tokenlist.get(i - 1));

                    if (token.equals("*"))
                        res = a * b;
                    if (token.equals("+"))
                        res = a + b;
                    if (token.equals("-"))
                        res = a - b;
                    if (token.equals("/"))
                        res = a / b;

                    tokenlist.remove(i);
                    tokenlist.remove(i - 1);
                    tokenlist.remove(i - 2);

                    tokenlist.add(i - 2, String.valueOf(res));

                    break;
                }
            }
        }

        return Integer.parseInt(tokenlist.get(0));
    }
}