package net.test.error;

class RequiredKeysException extends Exception {

    public RequiredKeysException(String key, String details){
        super("AAAAA The " + key + " is not allowed: " + details);
    }

}