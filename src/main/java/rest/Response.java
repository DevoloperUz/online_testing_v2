package rest;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Response {
    private boolean success;
    private String message;
    private Object data;
    private List<Object> dataList;

    public Response(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public Response(boolean success, String message, Object data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public Response(boolean success, String message, List<Object> dataList) {
        this.success = success;
        this.message = message;
        this.dataList = dataList;
    }
}
