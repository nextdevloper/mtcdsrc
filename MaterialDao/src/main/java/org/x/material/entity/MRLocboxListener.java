package org.x.material.entity;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PostDeleteContext;
import org.seasar.doma.jdbc.entity.PostInsertContext;
import org.seasar.doma.jdbc.entity.PostUpdateContext;
import org.seasar.doma.jdbc.entity.PreDeleteContext;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;

/**
 * ロケーションボックス関連マスタリスナー.
 *
 * @author  nakada
 * @since   XXXXXXXX.01.00
 * @version 20141029.00.01
 */
public class MRLocboxListener implements EntityListener<MRLocbox> {

    @Override
    public void preInsert(final MRLocbox entity, final PreInsertContext<MRLocbox> context) {
    }

    @Override
    public void preUpdate(final MRLocbox entity, final PreUpdateContext<MRLocbox> context) {
    }

    @Override
    public void preDelete(final MRLocbox entity, final PreDeleteContext<MRLocbox> context) {
    }

    @Override
    public void postInsert(final MRLocbox entity, final PostInsertContext<MRLocbox> context) {
    }

    @Override
    public void postUpdate(final MRLocbox entity, final PostUpdateContext<MRLocbox> context) {
    }

    @Override
    public void postDelete(final MRLocbox entity, final PostDeleteContext<MRLocbox> context) {
    }
}