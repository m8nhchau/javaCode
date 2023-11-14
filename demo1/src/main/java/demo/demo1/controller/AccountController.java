package demo.demo1.controller;

import demo.demo1.dto.requestDTO.AccountRequestDTO;
import demo.demo1.dto.responseDTO.AccountDTO;
import demo.demo1.dto.responseDTO.AccountResponseDTO;
import demo.demo1.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/account")
    public ResponseEntity<List<AccountDTO>> getAccount() {
        List<AccountDTO> accountDtos = accountService.getAccount();
        return ResponseEntity.ok(accountDtos);
    }

    @PostMapping("/find-account")
    public ResponseEntity<List<AccountResponseDTO>> findAccount(@RequestBody AccountRequestDTO accountRequestDTO) {
        List<AccountResponseDTO> accountResponseDTOs = accountService.findAccount(accountRequestDTO);
        return ResponseEntity.ok(accountResponseDTOs);
    }


}
