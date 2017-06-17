package org.x.material.entity;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PostDeleteContext;
import org.seasar.doma.jdbc.entity.PostInsertContext;
import org.seasar.doma.jdbc.entity.PostUpdateContext;
import org.seasar.doma.jdbc.entity.PreDeleteContext;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;

/**
 * アカウントマスタ（送信先）リスナー.
 *
 * @author  nakada
 * @since   XXXXXXXX.01.00
 * @version 20141029.00.01
 */
public class MAccountBlockSendListener implements EntityListener<MAccountBlockSend> {

    @Override
    public void preInsert(final MAccountBlockSend entity, final PreInsertContext<MAccountBlockSend> context) {
    }

    @Override
    public void preUpdate(final MAccountBlockSend entity, final PreUpdateContext<MAccountBlockSend> context) {
    }

    @Override
    public void preDelete(final MAccountBlockSend entity, final PreDeleteContext<MAccountBlockSend> context) {
    }

    @Override
    public void postInsert(final MAccountBlockSend entity, final PostInsertContext<MAccountBlockSend> context) {
    }

    @Override
    public void postUpdate(final MAccountBlockSend entity, final PostUpdateContext<MAccountBlockSend> context) {
    }

    @Override
    public void postDelete(final MAccountBlockSend entity, final PostDeleteContext<MAccountBlockSend> context) {
    }
}