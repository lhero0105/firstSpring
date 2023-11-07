package com.green.springfrist.board;

import com.green.springfrist.board.model.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
// json 리턴
@RequiredArgsConstructor // 다 주입
// @ Autowired // 빈등록 한애만 주입
public class BoardController {

    private final BoardService service;

    @GetMapping("/board")
    public List<BoardVo> getBoard(){
        return service.getBoard();
    }
}
