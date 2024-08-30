public class UserBuilder {
    private String name;
    private String email;
    private String phone;

    private UserBuilder(String name , String email , String phone){
        this.email = email;
        this.name = name;
        this.phone = phone;
    }

    public void print(){
        System.out.println("name : "+this.name+" , email : "+this.email+" , phone : "+this.phone);
    }

    public static class Builder{
        private String name;
        private String email;
        private String phone;
        public Builder(){}
        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder email(String email){
            this.email = email;
            return this;
        }
        public Builder phone(String phone){
            this.phone = phone;
            return this;
        }

        public UserBuilder build(){
            return new UserBuilder(this.name,this.email,this.phone);
        }
    }
}
