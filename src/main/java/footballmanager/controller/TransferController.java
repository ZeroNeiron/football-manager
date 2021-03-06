package footballmanager.controller;

import footballmanager.dto.request.TransferRequestDto;
import footballmanager.dto.response.TransferResponseDto;
import footballmanager.service.TransferService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transfers")
public class TransferController {
    private final TransferService transferService;

    public TransferController(TransferService transferService) {
        this.transferService = transferService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TransferResponseDto makeTransfer(@RequestBody TransferRequestDto requestDto) {
        return transferService.transferPlayer(requestDto);
    }
}