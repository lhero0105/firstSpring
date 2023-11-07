package com.green.springfrist.board;

import com.green.springfrist.board.model.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
// 빈등록
public class BoardService {
    private final BoardMapper mapper;
    public List<BoardVo> getBoard(){
        return mapper.selBoardList();
    }
}
