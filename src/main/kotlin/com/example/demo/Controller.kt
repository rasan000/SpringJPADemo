package com.example.demo

import org.springframework.web.bind.annotation.*


@RequestMapping("/")
@RestController
class Controller(private val reserveRepository: ReserveRepository) {

    // getで呼び出されたとき全ての予約情報を取得する
    @GetMapping("/api")
    fun getReserves(): List<ReserveModel> {
        return reserveRepository.findAll();
    }

    //  ポストで呼び出された時テーブルに追加する
    @PostMapping("/api")
    fun postReserve(@RequestBody reserveRequestModel: ReserveRequestModel): ReserveModel {
        val saveModel = ReserveModel(
            reserveRequestModel.id,
            reserveRequestModel.departureDate,
            reserveRequestModel.departureTime.replace(":", "")
        )
        return reserveRepository.save(saveModel);
    }
}