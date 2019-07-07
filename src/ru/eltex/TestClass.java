package ru.eltex;

public class TestClass implements Swimmable {
        String productName;
        private Integer productPrice;

        public TestClass() {

        }

        public TestClass(String product, Integer priseProduct) {
            productName = product;
            productPrice = priseProduct;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        private void setProductPrice(Integer productPrice) {
            this.productPrice = productPrice;
        }

    @Override
    public void Swim() {
        System.out.println("Я плыву");
    }
}
