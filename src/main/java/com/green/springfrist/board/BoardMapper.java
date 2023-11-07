package com.green.springfrist.board;

import com.green.springfrist.board.model.BoardVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<BoardVo> selBoardList();
}
