(ns sicp-clj.ch-2.square-of-four)

(declare beside below)

(defn square-of-four [tl tr bl br]
  (fn [painter]
    (let [top (beside (tl painter)
                       (tr painter))
          bottom (beside (bl painter)
                         (br painter))]
      (below bottom top))))

(declare flip-vert)

(defn flipped-pairs [painter]
        (let [combine4 (square-of-four identity flip-vert
                                       identity flip-vert)]
          (combine4 painter)))

(declare flip-horiz rotate180 corner-split)

(defn square-limit [painter n]
  (let [combine4 (square-of-four flip-horiz identity
                                 rotate180 flip-vert)]
    (combine4 (corner-split painter n))))
