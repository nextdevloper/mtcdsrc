select
  mt_id
  , mt_kind1
  , mt_kind2
  , mt_nm
  , default_locale
  , ex_cnt
  , ins_acc
  , ins_date
  , upd_acc
  , upd_date
  , del_flg
  , mt_onr_id
  , rec_id
from
  m_material
where
  /*%if delFlg != null */
  del_flg = /* delFlg */'0'
  /*%end */
and
  mt_id = /* mtId */'12345678901234567890'

