package demo.demo1.dto.responseDTO;

import lombok.Data;

@Data
public class AccountDTO {
    private String fullName;
    private Double availBlance;
    private Double pendingBalance;
    private String Status;
}
