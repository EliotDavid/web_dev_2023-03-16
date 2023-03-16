package com.jihoon.board.dto.request.board;

import java.io.PrintWriter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PatchBoardDto {
    
    @Min(1)
    private int boardNumber;
    
    @NotBlank
    private String boardTitle;
    
    @NotBlank
    private String boardContent;
    
    private String boardImgUrl;
}
