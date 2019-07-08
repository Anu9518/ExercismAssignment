class Twofer {
    String twofer(String name) {
        String result = "One for you, one for me.";
        if(name == null){
            return result;
        }
        else{
            return result.replace("you",name );
        }
    }
}
