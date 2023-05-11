package com.GameProjeto.list;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_beilonging")
public class Belonging {
    @EmbeddedId
    private BelongingPk id = new BelongingPk();
    private int position;

    public Belonging(Game game,GameList list,int position) {
        id.setGame(game);
        id.setList(list);
        this.position = position;
    }

    public BelongingPk getId() {
        return id;
    }

    public void setId(BelongingPk id) {
        this.id = id;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Belonging belonging)) return false;
        return id.equals(belonging.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
