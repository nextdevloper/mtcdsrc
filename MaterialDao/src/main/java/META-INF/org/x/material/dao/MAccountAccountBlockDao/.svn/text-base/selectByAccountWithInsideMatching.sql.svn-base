select
  *
from m_account
where
  del_flg = '0'
/*%if srcAccId != null */
  and
  acc_id like /* @contain(srcAccId) */'%X%' escape '$'
/*%end*/
order by acc_nm_kana
