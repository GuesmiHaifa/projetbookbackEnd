package fr.dawan.BOOKPROJECT.enums;

public enum UserType {

    ADMIN("Admin"),
    USER("Utilisateur");


     private String userType;

     UserType(String  userType) {
            this.userType =   userType;
        }

        public String getUrl() {
            return   userType;
        }
}
