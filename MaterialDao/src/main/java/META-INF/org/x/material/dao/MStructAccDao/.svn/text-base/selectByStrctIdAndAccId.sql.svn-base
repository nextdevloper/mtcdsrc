select
   A.strct_id
  ,A.struct_kind
  ,A.struct_stat
  ,A.struct_nm
  ,A.struct_nm_kana
  ,A.struct_nm_nick
  ,A.mailaddress
  ,A.password
  ,A.tel1
  ,A.tel2
  ,A.note
  ,A.default_locale
  ,A.ex_cnt
  ,A.ins_acc
  ,A.ins_date
  ,A.upd_acc
  ,A.upd_date
  ,A.del_flg
  ,B.admin_flg
  ,C.acc_id
  ,C.acc_kind
from
  ((
    m_structure A inner join (
      select strct_id, acc_id, admin_flg from m_r_strctacc where del_flg = '0' and admin_flg = '1'
    ) B
    on
      A.strct_id = B.strct_id)
    inner join (
      select acc_id, acc_kind from m_account where del_flg = '0'
    ) C
    on
      B.acc_id = C.acc_id)
where
  A.del_flg = '0'
/*%if srcStrctId != null */
and
  A.acc_id = /* srcStrctId */'srcStrctId'
/*%end */
/*%if accId != null */
and
  C.acc_id = /* accId */'AccId'
/*%end */

