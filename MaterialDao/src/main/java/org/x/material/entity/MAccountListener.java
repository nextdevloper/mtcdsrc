package org.x.material.entity;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PostDeleteContext;
import org.seasar.doma.jdbc.entity.PostInsertContext;
import org.seasar.doma.jdbc.entity.PostUpdateContext;
import org.seasar.doma.jdbc.entity.PreDeleteContext;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;

/**
 * アカウントマスタ	 アカウント情報リスナー.
 *
 * @author  nakada
 * @since   XXXXXXXX.01.00
 * @version 20141029.00.01
 */
public class MAccountListener implements EntityListener<MAccount> {

    @Override
    public void preInsert(final MAccount entity, final PreInsertContext<MAccount> context) {
    }

    @Override
    public void preUpdate(final MAccount entity, final PreUpdateContext<MAccount> context) {
    }

    @Override
    public void preDelete(final MAccount entity, final PreDeleteContext<MAccount> context) {
    }

    @Override
    public void postInsert(final MAccount entity, final PostInsertContext<MAccount> context) {
    }

    @Override
    public void postUpdate(final MAccount entity, final PostUpdateContext<MAccount> context) {
    }

    @Override
    public void postDelete(final MAccount entity, final PostDeleteContext<MAccount> context) {
    }
}