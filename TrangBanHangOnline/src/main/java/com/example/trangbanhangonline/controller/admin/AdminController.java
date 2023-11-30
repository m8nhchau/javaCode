package com.example.trangbanhangonline.controller.admin;

import com.example.trangbanhangonline.dto.requestDTO.OrderRequestDTO;
import com.example.trangbanhangonline.dto.requestDTO.ProductRequestDTO;
import com.example.trangbanhangonline.dto.requestDTO.UserRequestDTO;
import com.example.trangbanhangonline.dto.responseDTO.OrderResponseDTO;
import com.example.trangbanhangonline.dto.responseDTO.ProductResponseDTO;
import com.example.trangbanhangonline.dto.responseDTO.UserResponseDTO;
import com.example.trangbanhangonline.entity.Orders;
import com.example.trangbanhangonline.entity.Product;
import com.example.trangbanhangonline.entity.User;
import com.example.trangbanhangonline.enums.UserRoleEnum;
import com.example.trangbanhangonline.service.AdminService;
import com.example.trangbanhangonline.service.SessionService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
@RequestMapping("/api/admin")
public class AdminController {
    private final AdminService adminService;
    private final SessionService sessionService;
//Them sua xoa Product
    @PostMapping("/create-product")
    public ResponseEntity<ProductResponseDTO> addProduct(@RequestHeader(name = "SESSION_CODE") String sessionCode,@RequestBody ProductRequestDTO productRequestDTO) {
        User currentUser = sessionService.validate(sessionCode);
        if(!currentUser.getUserRole().equals(UserRoleEnum.ADMIN)){
            throw new RuntimeException("Bạn không có quyền truy nhập!");
        }
        ProductResponseDTO createProduct = adminService.addProduct(productRequestDTO);
        return new ResponseEntity<ProductResponseDTO>(createProduct, HttpStatus.OK);
    }

    @PostMapping("/delete-product")
    public ResponseEntity<Product> deleteProduct(@RequestHeader(name = "SESSION_CODE") String sessionCode,@RequestBody ProductRequestDTO productRequestDTO) {
        User currentUser = sessionService.validate(sessionCode);
        if(!currentUser.getUserRole().equals(UserRoleEnum.ADMIN)){
            throw new RuntimeException("Bạn không có quyền truy nhập!");
        }
        Product removeProduct = adminService.deleteProduct(productRequestDTO);
        return new ResponseEntity<Product>(removeProduct, HttpStatus.OK);
    }

    @PutMapping("/update-product")
    public ResponseEntity<Product> updateProduct(@RequestHeader(name = "SESSION_CODE") String sessionCode,@RequestBody ProductRequestDTO productRequestDTO) {
        User currentUser = sessionService.validate(sessionCode);
        if(!currentUser.getUserRole().equals(UserRoleEnum.ADMIN)){
            throw new RuntimeException("Bạn không có quyền truy nhập!");
        }
        Product addProduct = adminService.updateProduct(productRequestDTO);
        return new ResponseEntity<Product>(addProduct, HttpStatus.OK);
    }

// them sua xoa User
    @PostMapping("/create-user")
    public ResponseEntity<UserResponseDTO> addUser(@RequestHeader(name = "SESSION_CODE") String sessionCode, @RequestBody UserRequestDTO userRequestDTO){
        User currentUser = sessionService.validate(sessionCode);
        if(!currentUser.getUserRole().equals(UserRoleEnum.ADMIN)){
            throw new RuntimeException("Bạn không có quyền truy nhập!");
        }
        UserResponseDTO createUser = adminService.addUser(userRequestDTO);
        return new ResponseEntity<UserResponseDTO>(createUser, HttpStatus.OK);
    }

    @PutMapping("/update-user")
    public ResponseEntity<User> updateUser(@RequestHeader(name = "SESSION_CODE") String sessionCode,@RequestBody UserRequestDTO userRequestDTO){
        User currentUser = sessionService.validate(sessionCode);
        if(!currentUser.getUserRole().equals(UserRoleEnum.ADMIN)){
            throw new RuntimeException("Bạn không có quyền truy nhập!");
        }
        User addUser = adminService.updateUser(userRequestDTO);
        return new ResponseEntity<User>(addUser, HttpStatus.OK);
    }

    @PostMapping("/delete-user")
    public ResponseEntity<User> deleteUser(@RequestHeader(name = "SESSION_CODE") String sessionCode, @RequestBody UserRequestDTO userRequestDTO) {
        User currentUser = sessionService.validate(sessionCode);
        if(!currentUser.getUserRole().equals(UserRoleEnum.ADMIN)){
            throw new RuntimeException("Bạn không có quyền truy nhập!");
        }
        User removeUser = adminService.deleteUser(userRequestDTO);
        return new ResponseEntity<User>(removeUser, HttpStatus.OK);
    }

    //admin xac nhan don hang
    @PostMapping("/access-order")
    public ResponseEntity<Orders> updateOrder(@RequestHeader(name = "SESSION_CODE") String sessionCode, @RequestBody OrderRequestDTO orderRequestDTO){
        User currentUser = sessionService.validate(sessionCode);
        if(!currentUser.getUserRole().equals(UserRoleEnum.ADMIN)){
            throw new RuntimeException("Bạn không có quyền truy nhập!");
        }
        Orders addOrder = adminService.addOrder(orderRequestDTO);
    return ResponseEntity.ok(addOrder);
    }

}
