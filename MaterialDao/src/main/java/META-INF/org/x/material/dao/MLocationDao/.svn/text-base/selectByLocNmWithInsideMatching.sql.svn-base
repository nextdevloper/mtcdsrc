select
  loc_id
  , loc_kind
  , loc_nm
  , loc_onr_id
  , postcd
  , address
  , recipient
  , tel1
  , tag_a
  , tag_b
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
  del_flg = '0'
and
  (
   loc_kind = '01'
/*%if locOnrId != null */
   or
   loc_onr_id = /* locOnrId */'accountId'
/*%end*/
   )
/*%if locNm != null */
and
  loc_id || loc_nm like /* @contain(locNm) */'%X%' escape '$'
/*%end*/
order by
  upd_date desc
