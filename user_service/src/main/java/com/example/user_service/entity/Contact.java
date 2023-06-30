package com.example.user_service.entity;

public class Contact {
        private Long cId;
        private String email;
        private String contactName;
        private Long user_id;

        public Contact(Long cId, String email, String contactName, Long user_id) {
            this.cId = cId;
            this.email = email;
            this.contactName = contactName;
            this.user_id = user_id;
        }

        public Contact() {
        }

        public Long getcId() {
            return cId;
        }

        public void setcId(Long cId) {
            this.cId = cId;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getContactName() {
            return contactName;
        }

        public void setContactName(String contactName) {
            this.contactName = contactName;
        }

        public Long getUser_id() {
            return user_id;
        }

        public void setUser_id(Long user_id) {
            this.user_id = user_id;
        }
}
