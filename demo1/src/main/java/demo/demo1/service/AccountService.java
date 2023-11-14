package demo.demo1.service;

import demo.demo1.dto.requestDTO.AccountRequestDTO;
import demo.demo1.dto.responseDTO.AccountDTO;
import demo.demo1.dto.responseDTO.AccountResponseDTO;

import java.util.List;

public interface AccountService {
    List<AccountDTO> getAccount();

    List<AccountResponseDTO> findAccount(AccountRequestDTO accountRequestDTO);

    List<AccountResponseDTO> updataAccount(AccountRequestDTO accountRequestDTO);
}
