class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> record = new Stack<>();
        for(String op : operations){
                if(op.equals("C")){
                record.pop();
            }
            else if(op.equals("D")){
                record.push(2*record.peek());
            }
            else if(op.equals("+")){
                int sum = 0;
                int s1 = record.pop();
                int s2 = record.pop();
                sum = s1+s2;
                record.push(s2);
                record.push(s1);
                record.push(sum);
            }
            else{
                record.push(Integer.parseInt(op));
            }
        }
        int result = 0;
        while(!record.isEmpty()) {
            result += record.pop();
            }
        return result;
    }
}
