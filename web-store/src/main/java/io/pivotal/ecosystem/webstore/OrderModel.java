package io.pivotal.ecosystem.webstore;

import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * Created by cstewart on 3/13/18.
 */
public class OrderModel {



        private Integer productID;
        private Integer quantity;
        private String destinationZipCode;
        private Integer orderID;
        private String orderStatus;
        private String fulfilledBy;
        //private String productDescription;
        private String productImageURL;

        public OrderModel() {

        }

        public Integer getProductID()
        {
            return productID;
        }
        public void setProductID(Integer productID)
        {
            this.productID = productID;
        }

        public Integer getQuantity() { return quantity; }
        public void setQuantity(Integer quantity) { this.quantity = quantity; }

        public String getDestinationZipCode(){ return destinationZipCode; }
        public void setDestinationZipCode(String destinationZipCode) { this.destinationZipCode = destinationZipCode; }

        public Integer getOrderID() { return orderID; }
        public void setOrderID(Integer orderID) { this.orderID = orderID; }

        public String getOrderStatus() { return orderStatus; }
        public void setOrderStatus(String orderStatus) { this.orderStatus = orderStatus; }

        public String getFulfilledBy() {
                return fulfilledBy;
        }
        public void setFulfilledBy(String fulfilledBy) {
                this.fulfilledBy = fulfilledBy;
        }

//        public String getProductDescription() { return productDescription; }
//        public void setProductDescription(String productDescription) { this.productDescription = productDescription; }

        public String getProductImageURL() { return productImageURL; }
        public void setProductImageURL(String productImageURL) { this.productImageURL = productImageURL;}


        @Override
        public String toString()
        {
            return "OrderModel [productID=" + productID + ", Quantity=" + quantity + ", Shipping Address=" + destinationZipCode + "]";

        }
}
