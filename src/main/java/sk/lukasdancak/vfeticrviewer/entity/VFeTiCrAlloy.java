package sk.lukasdancak.vfeticrviewer.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "alloy")
@IdClass(VFeTiCrAlloyId.class)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VFeTiCrAlloy {

    @jakarta.persistence.Id
    @Column(nullable = false)
    private Integer vAtomicPercent;

    @jakarta.persistence.Id
    @Column(nullable = false)
    private Integer feAtomicPercent;

    @jakarta.persistence.Id
    @Column(nullable = false)
    private Integer tiAtomicPercent;

    @jakarta.persistence.Id
    @Column(nullable = false)
    private Integer crAtomicPercent;
}
