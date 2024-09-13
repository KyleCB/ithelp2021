package idv.kuma.ithelp2021.student.register;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiResponse {
    private Integer errorCode;


    public static ApiResponse empty() {
        return new ApiResponse(0);
    }

    public static ApiResponse bad(int errorCode) {
        return new ApiResponse(errorCode);
    }
}
