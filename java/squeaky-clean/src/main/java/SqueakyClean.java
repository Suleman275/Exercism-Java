class SqueakyClean {
    static String clean(String identifier) {
        //throw new UnsupportedOperationException("Please implement the (static) SqueakyClean.clean() method");
        identifier = identifier.replaceAll(" ", "_");
        identifier = identifier.replaceAll("\0", "CTRL");

//        StringBuilder builder = new StringBuilder(identifier);
//        if (builder.indexOf("-") != -1) {
//            int index = builder.indexOf("-");
//            Character lower = builder.charAt(index + 1);
//            Character upper = Character.toUpperCase(lower);
//            builder.replace(index+1, index +1, upper.toString());
//        }

        while (identifier.contains("-")){
            int dashIndex = identifier.indexOf("-");
            Character lower = identifier.charAt(dashIndex + 1);
            Character upper = Character.toUpperCase(lower);
            identifier = identifier.replace(lower, upper);
            identifier = identifier.replace("-", "");
        }


        return identifier;
    }
}
