package sk.lukasdancak.vfeticrviewer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VFeTiCrAlloyId implements Serializable {
    private Integer vAtomicPercent;
    private Integer feAtomicPercent;
    private Integer tiAtomicPercent;
    private Integer crAtomicPercent;
}
