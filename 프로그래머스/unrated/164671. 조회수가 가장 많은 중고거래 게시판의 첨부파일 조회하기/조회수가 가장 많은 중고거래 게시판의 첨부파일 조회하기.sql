-- 코드를 입력하세요
-- SELECT '/home/grep/src/'||BOARD_ID ||'/'||FILE_ID||FILE_NAME||FILE_EXT FILE_PATH
--   FROM USED_GOODS_FILE
--  WHERE BOARD_ID = ( SELECT BOARD_ID 
--                       FROM ( SELECT BOARD_ID
--                                FROM USED_GOODS_BOARD
--                               ORDER BY VIEWS DESC
--                            )
--                      WHERE ROWNUM = 1
--                    )

SELECT '/home/grep/src/'||BOARD_ID ||'/'||FILE_ID||FILE_NAME||FILE_EXT FILE_PATH
  FROM USED_GOODS_FILE
 WHERE BOARD_ID = ( SELECT BOARD_ID 
                      FROM USED_GOODS_BOARD
                     WHERE VIEWS = ( SELECT MAX(VIEWS) FROM USED_GOODS_BOARD )
                   )
 ORDER BY FILE_ID DESC