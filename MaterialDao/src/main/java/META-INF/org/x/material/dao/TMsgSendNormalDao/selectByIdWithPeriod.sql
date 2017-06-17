select
  acc_id,
  acc_id_send,
  msg_no,
  msg_title,
  msg_note,
  default_locale,
  ex_cnt,
  ins_acc,
  ins_date,
  upd_acc,
  upd_date,
  del_flg
from
  t_msg_send_normal
where
  del_flg = '0'
/*%if accIdSend != null */
  and
  acc_id_send = /* accIdSend */'a'
/*%end */
/*%if startDate != null */
  and
  upd_date >= /* startDate */'2014-09-01 00:00:00'
/*%end */
/*%if endDate != null */
  and
  upd_date <= /* endDate */'2014-09-01 23:59:59'
/*%end */
order by
  upd_date desc
