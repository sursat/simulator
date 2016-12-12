package entities;

/**
 * Created by egnaro on 12/12/16.
 */
public enum StatusCode {

    OK(200),ACCEPTED(201),BAD_REQUEST(400),UN_AUTHORIZED(401),INTERNAL_ERROR(500);

    private int value;

    StatusCode(int value){this.value = value;}

    static public boolean isMember(int value){
        StatusCode[] statusCodes = StatusCode.values();
        for(StatusCode statusCode : statusCodes)
            if(statusCode.value == value)
                return true;
        return false;
    }

}
