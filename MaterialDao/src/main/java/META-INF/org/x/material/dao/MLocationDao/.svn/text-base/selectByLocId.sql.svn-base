select
  loc_id
  , loc_kind
  , loc_nm
  , loc_onr_id
  , postcd
  , address
  , recipient
  , tag_a
  , tag_b
  , tel1
  , note
  , default_locale
  , ex_cnt
  , ins_acc
  , ins_date
  , upd_acc
  , upd_date
  , del_flg
  , rec_id
from
  m_location
where
/*%if delFlg != null */
  del_flg = /* delFlg */'0'
/*%end */
/*%if locId != null */
and
  loc_id = /* locId */'LocationId'
/*%end */
