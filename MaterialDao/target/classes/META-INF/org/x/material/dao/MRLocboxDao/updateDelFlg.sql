update m_r_locbox
set
   del_flg = /* delFlg */'1'
  ,ex_cnt = ex_cnt + 1
  ,upd_acc = /* accId */'abcd120'
  ,upd_date = CURRENT_TIMESTAMP
where
/*%if locId != null */
  loc_id = /* locId */'123ABC'
/*%end */
/*%if boxId != null */
and
  box_id = /* boxId */'123ABC'
/*%end */