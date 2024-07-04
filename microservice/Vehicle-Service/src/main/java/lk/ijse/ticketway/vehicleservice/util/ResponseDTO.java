package lk.ijse.ticketway.vehicleservice.util;

import java.util.HashMap;

/**
 * @version: v0.0.1
 * @author: Navishka
 * @date: 7/4/2024
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO {
    private int status;
    private String message;
    private HashMap<String, Object> data = new HashMap<>();

    public ResponseDTO(String message, int status) {
        this.message = message;
        this.status = status;
    }
}
