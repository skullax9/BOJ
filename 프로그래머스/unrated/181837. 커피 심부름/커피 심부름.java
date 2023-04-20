class Solution {
    public int solution(String[] order) {
        final int americano = 4500;
        final int latte = 5000;
        int price = 0;
        
        for (String menu : order) {
            if (menu.contains("cafelatte")) {
                price += latte;
            } else {
                price += americano;
            }
        }
        
        return price;
    }
}